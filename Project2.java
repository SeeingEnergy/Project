  //Salle A Zewde,09/12/2022,ITECH-118-03
/*Requirements
*Forecast temperature as an integer
**Forecast chance of precipitation as an integer
*Combination temperature and precipitation forecast in text format without numbers.
*A wardrobe suggestion based on forecast with an item from each of the categories listed above.
*In the output, remember to use plain language for non-technical users
*/

import java.util.Random;

public class Project2{
  public static void main(String[] args) {

    Random randomNumber = new Random();

    int result = randomNumber.nextInt(60) + 35;
    /*temperature between 35 and 95 - 60 + 35 = 95
    */
    int prec = randomNumber.nextInt(99) + 1;
    //chance of precipitation between 0 and 100 percent.

    System.out.println("\nThe temperuature is forecast to be " + result+ " degrees.");
    System.out.println("\nThe chance of precipitation is "+ prec+" percent.");

/*100/3 to get the three types of cloudy
1-34 == Sunny
35-66 == Partly cloudy
66- 100 ==Cloudy
*/

    if (prec >= 1 && prec <= 34){
        System.out.print("\nLooks like Sunny ");
    }else if(prec >= 35 && prec <= 66){
        System.out.print("\nLooks like Partly cloudy ");
    }else{
        System.out.print("\nLooks like Cloudy ");
  }

//got the temperuature from Lab 9/16
      if (result >= 35 && result <= 44) {
        System.out.println("and cold today.");
      }else if (result >= 45 && result <= 54){
        System.out.println("and chilly today.");
      }else if (result >= 55 && result <= 64){
          System.out.println("and cool today.");
      }else if (result >= 65 && result <= 74){
          System.out.println("and warm today.");
      }else if (result >= 75 && result <= 84){
          System.out.println("and warmer today.");
      }else if (result >= 85 && result <= 95){
          System.out.println("and hot today.");
      }

/*divide the temperuature into three groups
35-54 cold/chilly - sweater and pants
55-74 cool/warmer - T-shirt and pants
75-95 warmer/hot - T-shirt and shorts
*/

/*divide the precipitation into two groups
1-66 Sunny/Partly cloudy - sunglass
67-100 Cloudy - no Sunglass
*/
      if ( result >= 35 && result <= 54 && prec >= 1 && prec <= 66 ){
        System.out.println("\nYou may wish to consider wearing a sweater and pants with sunglass.");
      }else if( result >= 35 && result <= 54 && prec >=67  && prec <= 100 ){
        System.out.println("\nYou may wish to consider wearing a sweater and pants. ");
      }else if( result >= 55 && result <= 74 && prec >=1  && prec <= 66 ){
        System.out.println("\nYou may wish to consider wearing a T-shirt and pants with sunglass.");
      }else if( result >= 55 && result <= 74 && prec >=67  && prec <= 100 ){
        System.out.println("\nYou may wish to consider wearing a T-shirt and pants. ");
      }else if( result >= 75 && result <= 95 && prec >=1  && prec <= 66 ){
        System.out.println("\nYou may wish to consider wearing a T-shirt and shorts with sunglass.");
      }else if( result >= 75 && result <= 95 && prec >=67  && prec <= 100 ){
        System.out.println("\nYou may wish to consider wearing a T-shirt and shorts.");
      }
  }
}
