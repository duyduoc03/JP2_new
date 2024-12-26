package org.example.backend;

import org.example.entity.National;

public interface NationalDAO {
	public void addNational(National national);
	public void deleteNational(int id);
}
