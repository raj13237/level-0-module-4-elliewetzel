
void setup(){
  size(800,800);
}
void draw() {
  background(13,176,183);
  if(mouseX<115){
    mouseX=115;
  }
  if(mouseX>260){
    mouseX=260;
  }
  if(mouseY<250){
    mouseY=250;
  }
  if(mouseY>350){
    mouseY=350;
  }
  fill(255,255,255);
  ellipse(196,306,200,150);
  ellipse(535,306,200,150);
  fill(0,0,0);
  ellipse(mouseX,mouseY,50,50);
  ellipse(mouseX +341 ,mouseY,50,50);
 
  
  
}