int tailX;
int tailY;
boolean apply=false;
PImage donkey;
PImage tail;
void setup() {
   size(249,202);
  donkey = loadImage("donkey.jpeg");
  tail = loadImage("Donkey-tail.png");
  tail.resize(50,50);
  image(tail,mouseX-10,mouseY-20);
}
void draw() {
  background (255);
  if(apply ==false){
  image(tail,mouseX,mouseY);
  }
  rect(0,0,30,30);
  //print(mouseX); 226,69
  rect(226,69,40,40);
  if(dist(0,0,mouseX,mouseY)<30){
    image(donkey,0,0);
  }
  if(mousePressed){
    tailX= mouseX;
    tailY= mouseY;
    apply =true;
  }
  if(apply==true){
    image(tail,tailX,tailY);
  }
  
  
  
}