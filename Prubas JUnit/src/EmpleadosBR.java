
public class EmpleadosBR {

	public float calculosalariobruto(int tipo, float ventames, float horas){
		
		int salario=0;
		if (tipo==1){
			salario=1500;
		}
		else if(tipo==0){
			salario=1000;
		}
		
		if(ventames>=1500){
			salario=salario+200;
		}
		else if(ventames>=1000){
			salario=salario+100;
		}
		for(int i=0;i<horas;i++){
			salario=salario+20;
		}
		return salario;
	}
	
	public float calcularsalarioneto(float salariobruto){
		if(salariobruto>1000 && salariobruto<1500){
			salariobruto=(float) (salariobruto*1.16);
		}
		else if(salariobruto>=1500){
			salariobruto=(float) (salariobruto*1.18);
		}
		return salariobruto;
	}
}
