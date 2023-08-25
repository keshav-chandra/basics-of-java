package demo;
public class ArrayList{
	 private object[]a;
	 private int p;
	 public ArrayList() {
		 a=new object[5];
		 p=0;
	 }
	 public void add(object e) {
		 if(p>=a.length)increase();
		 a[p++]=e;
	 }
	 private void increase() {
		 object[]temp=new object[a.length+3];
		 System.arraycopy(a, 0, temp, 0, a.length);
		 a=temp;
	 }
	 public int size() {
		 return p;
	 }
	 public object get(int index) {
		 if(index<=-1||index>=size()) {
			 throw new IndexOutOfBoundsException();
		 }
		 return a[index];
	 }
}