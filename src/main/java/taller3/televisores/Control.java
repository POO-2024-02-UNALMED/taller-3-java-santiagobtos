package taller3.televisores;

public class Control {
	TV tv;
	
	public void enlazar(TV asigna) {
		this.tv=asigna;
		this.tv.setControl(this);
	}
	public void turnOn() {
		tv.turnOn();
	}
	public void turnOff() {
		this.tv.turnOff();
	}
	public void canalUp() {
		this.tv.canalUp();
	}
	public void canalDown() {
		this.tv.canalDown();
	}
	public void setCanal(int chanel) {
		this.tv.setCanal(chanel);
	}
	public void setVolumen(int volu) {
		this.tv.setVolumen(volu);
	}
	public void setTv(TV nuevo) {
		this.tv=nuevo;
	}
	public TV getTv() {
		return this.tv;
	}
	public void	volumenUp() {
		this.tv.volumenUp();
	}
	public void volumenDown() {
		this.tv.volumenDown();
	}
}
