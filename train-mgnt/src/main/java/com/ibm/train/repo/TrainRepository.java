package com.ibm.train.repo;

import java.util.Collection;

import com.ibm.train.pojo.Train;

public interface TrainRepository {
	
	int saveTrain(Train t);
	
	Train fetchtrain(int tcode);
	
	Collection<Train> fetchAll();
	
     void  delTrain(int tcode);

}
