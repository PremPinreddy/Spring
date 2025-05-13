package constructor_inj;

public class Certi {
     String certi;
     
      public Certi() {}

	public Certi(String certi) {
		super();
		this.certi = certi;
	}

	public String getcerti() {
		return certi;
	}

	public void setcerti(String certi) {
		this.certi = certi;
	}
	@Override     
	public String toString()
	{
		return this.certi;
	}
}
