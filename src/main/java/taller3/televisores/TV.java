package taller3.televisores;

public class TV {
	public static int numTV;
	private	Marca marca;
	private int canal = 1;
	private int precio= 500;
	private boolean estado;
	private int volumen= 1;
	private Control control;
	
	public 	TV(Marca marca, boolean estado) {
		this.marca=marca;
		this.estado=estado;
		numTV++;
		
	}
	public void setMarca(Marca marca) {
		this.marca=marca;
	} 
	public Marca getMarca () {
		return this.marca;
	}
	public void setCanal(int cambio) {
		if(estado==true) {
			if(cambio<1 || cambio>120) {
				return;
			}else {
				canal=cambio;
			}
			
		}else {
			return;
		}
	}
	public int getCanal() {
		return canal;
		
	}
	public void setPrecio(int newp) {
		precio=newp;
	} 
	public int getPrecio () {
		return precio;
	}
	public void setVolumen(int vol) {
		if (estado==true) {
			
		
			if(vol>7 || vol<0) {
				return;
		}	else {
				volumen=vol;
		}
		}else {
			return;
		}
		
		
	}
	public int getVolumen() {
		return volumen;
		
	}
	public void setControl(Control newC) {
		control=newC;
	}
	public Control getControl() {
		return control;
	}
	public static void setNumTV(int nuevo) {
		numTV=nuevo;
	}
	public int getNumTV() {
		return numTV;
		
	}
	public void turnOn() {
		estado=true;
	}
	public void turnOff() {
		estado=false;
	}
	public boolean getEstado() {
		return estado;
	}
	public void canalUp() {
		if(estado==true) {
			if (canal==120) {
				return;
			}else {
				canal+=1;
			}
		}else {
			return;
		}
	}
	public void canalDown() {
		if(estado==true) {
			if (canal==1) {
				return;
			}else {
				canal-=1;
			}
		
		}else {
			return;
		}
		
	}
	public void volumenUp() {
		if(estado==true) {
			if(volumen >=7) {
				return;
			}else {
				volumen+=1;
			}
		}else {
			return;
		}
	}
	public void volumenDown() {
		if(estado==true) {
			if(volumen<=0) {
				return;
			}else {
				volumen-=1;
			}
		}else {
			return;
		}
	}
}
