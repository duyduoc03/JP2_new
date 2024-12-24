package Session14;
import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;
public class FlowAPIDemo {
	public static void main(String[] args) {
		SubmissionPublisher<String> publisher = new SubmissionPublisher<>();

        Flow.Subscriber<String> subscriber = new Flow.Subscriber<>() {
            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                System.out.println("Subscribed!");
                subscription.request(1);
            }

            @Override
            public void onNext(String item) {
                System.out.println("Received: " + item);
            }

            @Override
            public void onError(Throwable throwable) {
                throwable.printStackTrace();
            }

            @Override
            public void onComplete() {
                System.out.println("Done!");
            }
        };

        publisher.subscribe(subscriber);
        publisher.submit("Hello, Flow API!");
        publisher.close();
    }
}
