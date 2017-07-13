int asdfghjkl = 600;
int lkjhgfdsa = 900;
int speed = 1;
void setup(){
  size(1500, 500);
}
void draw(){
  background (255, 255, 255);
  asdfghjkl+=speed;
  lkjhgfdsa-=speed;
  for(int circle = 240; circle>1; circle-=11){
    noFill();
    ellipse(asdfghjkl, 250, circle, circle);
    
  }
   for(int circle = 240; circle>1; circle-=11){
    noFill();
    ellipse(lkjhgfdsa, 250, circle, circle);
    
  }
 if(asdfghjkl==900&&lkjhgfdsa==600){
   speed=-speed;
   
}
}