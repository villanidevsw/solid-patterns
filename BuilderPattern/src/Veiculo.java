
public class Veiculo {
	
	private double price;
	private String type;
	private String make;
	private int horsePower;
	private String model;
	private String color;
	private int doors;
	
	private Veiculo(Builder builder){
		this.type = builder.type;
		this.make = builder.make;
        this.model = builder.model;
        this.price = builder.price;
        this.doors = builder.doors;
        this.color = builder.color;
        this.horsePower = builder.horsePower;
	}
	
	@Override
    public String toString() {
        return "Veiculo [type=" + type + ", make=" + make + ", model=" + model
                + ", price=" + price + ", doors=" + doors + ", color=" + color
                + ", horsePower=" + horsePower + "]";
    }
	
	public static class Builder {
		private double price;
		private String type;
		private String make;
		private int horsePower;
		private String model;
		private String color;
		private int doors;
		
		public Builder type(String valor){
			this.type = valor;
			return this;
		}
		
		public Builder make(String value){
            this.make = value;
            return this;
        }
        public Builder model(String value){
            this.model = value;
            return this;
        }
        public Builder price(double value){
            this.price = value;
            return this;
        }
        public Builder doors(int value){
            this.doors = value;
            return this;
        }
        public Builder color(String value){
            this.color = value;
            return this;
        }
        public Builder horsePower(int value){
            this.horsePower = value;
            return this;
        }
		
		public Veiculo build (){			
			return new Veiculo(this);
		}
	}
}
