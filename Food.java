
public class Food extends ImageView{
    String name;
    String group;
    int quantity;
    //assuming every month has 30 days
    //creation
    int creationDay;
    int creationMonth;
    int creationYear;
    //expiry
    int expDay;
    int expMonth;
    int expYears;
    //age in days              
    int age;
    //age
    private int calculateAge(){
        //if creationDay<expDay (ex. Jan 6, May 3)
        if (creationDay-expDay<0){
          age = expDay + (30 * (expMonth-creationMonth)-creationDay);
        }
        //if creationDay<expDay (ex. Jan 3, May 6)
        else {
          age = expDay-creationDay + (expMonth-creationMonth) * 30;
        }
    }
  
    public Food(String name, int creationDay, int creationMonth, int creationYear, int quantity, String group){
        this.creationDay = creationDay;
        this.creationMonth = creationMonth;
        this.creationYear = creationYear;
        this.name = name;
        this.quantity = quantity;
        this.group = group;
        setImage();
    }
    
    public Food(String name, int creationDay, int creationMonth, int creationYear, String group){
        this.creationDay = creationDay;
        this.creationMonth = creationMonth;
        this.creationYear = creationYear;
        this.name = name;
        this.group = group;
        setImage();
    }
  
    private void setImage(){
      imageName = name + ".jpeg";
      switch(name.toLowerCase()){
        case "apple":
          this.setImageResource(R.drawable.apple); 
          break;
        case "tomato":
          this.setImageResource(R.drawable.tomato); 
          break;
        case "avocado":
          this.setImageResource(R.drawable.avocado); 
          break;
        case "leafy greens":
          this.setImageResource(R.drawable.leafies); 
          break;
        case "orange":
          this.setImageResource(R.drawable.orange); 
          break;
        case "milk":
          this.setImageResource(R.drawable.milk); 
          break;
        case "yogurt":
          this.setImageResource(R.drawable.yogurt); 
          break;
        case "cheese":
          this.setImageResource(R.drawable.cheese); 
          break;
        case "bread":
          this.setImageResource(R.drawable.bread); 
          break;
        case "ham":
          this.setImageResource(R.drawable.ham); 
          break;
        case "chicken":
          this.setImageResource(R.drawable.chicken); 
          break;
        case "red meat":
          this.setImageResource(R.drawable.red_meat); 
          break;
        case "rice":
          this.setImageResource(R.drawable.rice); 
          break;
        case "eggs":
          this.setImageResource(R.drawable.eggs); 
          break;
        default:
          this.setImageResource(R.drawable.bowl); 
          break;
      }
    }
  
}


