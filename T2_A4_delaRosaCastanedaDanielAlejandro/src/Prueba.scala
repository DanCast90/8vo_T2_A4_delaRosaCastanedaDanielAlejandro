class Paciente(var nombre:String,
               var primerAp:String, 
               var segundoAp:String, 
               var edad:Int,
               var fecha:Array[String],
               var horaReg:Array[String],
               var nivelBienestar:Array[Int],
               var temperatura:Array[Double],
               var humedad:Array[Int]){
  
  
  def obtenerPromediosBienestar(): Int={
    var promedio=0
    for(x <-0 to nivelBienestar.length-1){
      promedio+=nivelBienestar(x)
    }
    promedio/nivelBienestar.length
  }
  
  def temperaturaMayor(): Unit={
    var temp=temperatura(0)
    var cont=0
     for(x <-0 to temperatura.length-1){
       if(temperatura(x)>temp){
         temp=temperatura(x)
         cont=x
       }
     }
    println("Temperatura mayor: "+temp+" fecha de esa temperatura"+fecha(cont)+
        " Hora de registro de esa temperatura: "+horaReg(cont)+" Nivel de Bienestar"+
        nivelBienestar(cont)+ " Humedad: "+humedad(cont))
    
  }
  
  def temperaturaMenor(): Unit={
     var temp=temperatura(0)
    var cont=0
     for(x <-0 to temperatura.length-1){
       if(temperatura(x)<temp){
         temp=temperatura(x)
         cont=x
       }
     }
    println("Temperatura Menor: "+temp+" fecha de esa temperatura"+fecha(cont)+
        " Hora de registro de esa temperatura: "+horaReg(cont)+" Nivel de Bienestar"+
        nivelBienestar(cont)+ " Humedad: "+humedad(cont))
    
  }
  
  override def toString:String="Datos del paciente-> \n [Nombre: "+nombre+"\nPrimer apellido: "+primerAp+"\nSegundo apellido: "+segundoAp+
  "\nEdad: "+edad+"]"
}

object Prueba {
  
  def main(args: Array[String]): Unit ={
  var fecha=Array("20/02/2020","21/02/2020","22/02/2020","23/02/2020","24/02/2020","25/02/2020","26/02/2020","27/02/2020")
  var horaReg=Array("10:10","11:10","12:10","13:10","14:10","15:10","16:10","17:10")
  var nivelBienestar=Array(4,2,1,5,5,3,4,1)
  var temperatura=Array(35.6,37.6,39.3,36.5,36.5,37.6,36.9,39.5)
  var humedad=Array(20,20,40,40,50,60,10,80)
  var nombre="Daniel"
  var edad=21
  var primerAp="de la Rosa"
  var segundoAp="Castaneda"
  
  var objeto=new Paciente(nombre,primerAp,segundoAp,edad,fecha,horaReg,nivelBienestar,temperatura,humedad)
  println("El promedio del bienestar es: "+objeto.obtenerPromediosBienestar())
  objeto.temperaturaMayor()
  objeto.temperaturaMenor()
  }
}