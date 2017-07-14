int exx = 200;
int whyy = 10;
PImage creeper;
PImage minecraft;
void setup (){
  size(900, 900);
  minecraft = loadImage("minecraft.jpg");
  minecraft.resize(900,900);
  creeper=loadImage("creeper.png");
  creeper.resize(6,6);
}
void draw (){
    background(minecraft);
  image(creeper, exx, whyy);
if(mouseX>210&&mouseY>25){
  noFill();
  stroke(255,0,0);
  ellipse(mouseX, mouseY, 50,50);
}
if(mouseX<=170&&mouseY<=170){
  noFill();
  stroke(0,255,0);
  ellipse(mouseX,mouseY,50,50);
}
if(isNear(mouseX,200)){
 if(isNear(mouseY,10)){
   noFill();
   stroke(0,255,0);
   ellipse(mouseX,mouseY,50,50);
   println("congrats. you won :]");
}
else{
  println("not even close. keep looking! :/");
}
}
}

boolean isNear(int a, int b) {
      if (abs(a - b) < 10)
          return true;
    else
       return false;
}