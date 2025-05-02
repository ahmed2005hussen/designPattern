public class context {
    private Stratagy stratagy ;

   public context(Stratagy stratagy) {
       this.stratagy = stratagy;
   }
   public double execute(int x , int y ){
      return stratagy.doOperation(x,y);
   }
}
