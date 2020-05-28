package question2;


/**
 * Décrivez votre classe FahrenheitCelsius ici.
 * 
 * @author (votre nom) 
 * @version (un numéro de version ou une date)
 */
public class FahrenheitCelsius{

     /** le point d'entrée de cette application, 
      * dont le commentaire est à compléter
      *
      *  @param args ...
      */
     public static void main(String[] args){
       try{
       
      
       }catch(NumberFormatException nfe){
           System.out.println("error : " + nfe.getMessage());  // en cas d'erreur 
       }
       
     }
     
     /** 
      * la méthode à compléter. 
      *   @param f la valeur en degré Fahrenheit
      *   @return  la conversion en degré Celsius
      */
     public static float fahrenheitEnCelsius( int f){
       float cell=5/9.0F*(f-32);
       NumberFormat formatter= NuberFormat.getInstance(Locale.US);
       formatter.setMaximumFactionDigits(1);
       String temp=formatter.format(cel);
       temp=temp.replaceAll("[,;\\s]","");
       Float formatedFloat=new Float(temp);
       return formatedFloat;
       
     }

}
