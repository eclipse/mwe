package stubs;

import java.util.ArrayList;
import java.util.List;

public class ObjectB {
	public ObjectA singleEle;
	public List<ObjectA> multiEle = new ArrayList<ObjectA>();

	public ObjectB another;

	public void addMultiEle(ObjectA multi) {
		multiEle.add(multi);
	}

	public void setAnother(ObjectB another) {
		this.another = another;
	}

	public void setSingleEle(ObjectA singleEle) {
		this.singleEle = singleEle;
	}

}
