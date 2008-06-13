package test;

import java.util.ArrayList;
import java.util.List;

public class ObjectB {
	public ObjectA singleEle;
	public List<ObjectA> multiEle = new ArrayList<ObjectA>();
	
	public void setSingleEle(ObjectA singleEle) {
		this.singleEle = singleEle;
	}
	
	public void addMultiEle(ObjectA multi) {
		this.multiEle.add(multi);
	}
	
}
