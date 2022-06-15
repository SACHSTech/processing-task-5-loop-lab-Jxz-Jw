import processing.core.PApplet;

public class Sketch extends PApplet {
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(1200, 600);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(45, 150, 207);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    draw_section_outlines();
    draw_section1();
    draw_section2();
    draw_section3();
    draw_section4();
	  
    draw_section5();
    draw_section6();
    draw_section7();
    draw_section8();

  }

  /**
   * Draw the outlines for all sections
   */
  public void draw_section_outlines(){
    stroke(0);
    noFill();

    // draw bottom row boxes
    rect(0,300, 300, 300);
    rect(300, 300, 300, 300);
    rect(600, 300, 300, 300);
    rect(900, 300, 300, 300);

    // draw top row boxes
    rect(0,0, 300, 300);
    rect(300, 0, 300, 300);
    rect(600, 0, 300, 300);
    rect(900, 0, 300, 300);
  }
  
  /**
   * draws the bottom left section
   */
  public void draw_section1(){ // 30 by 30 white blocks
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 3 + intRow;
        intY = 300 + 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
  }

  public void draw_section2(){ // vertically alternating white and black blocks
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 300 + 3 + intRow;
        intY = 300 + 3 + intColumn;
      
        if ((intRow/10) % 2 == 0)
        {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else 
        {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }

      }
    }
  }


  public void draw_section3(){ // horizontally alternating white and black blocks 
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 600 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        if ((intColumn/10) % 2 == 0)
        {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else 
        {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }

      }
    }
  }

  public void draw_section4(){ // black and white block grid with black bordering
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn < 300; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 300 + 3 + intColumn;

        if ((intRow/10) % 2 != 0 || (intColumn/10) % 2 == 0)
        {
          fill(0);
          noStroke();
          rect(intX, intY, 5, 5);
        }
        else 
        {
          fill(255);
          noStroke();
          rect(intX, intY, 5, 5);
        }

      }
    }
  }

  public void draw_section5(){ // bottom right diagonal half of white blocks
    int intX = 0;
    int intY = 0;
    
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 300 - intColumn; intRow < 300; intRow += 10){
        intX = 3 + intRow;
        intY = 3 + intColumn;
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      
      }
    }
  }

  public void draw_section6(){ // bottom left diagonal half of white blocks
    int intX = 0;
    int intY = 0;
    
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 0; intRow <= intColumn; intRow += 10){
        intX = 300 + 3 + intRow;
        intY = 3 + intColumn;
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      
      }
    }
  }

  public void draw_section7(){ // upper left diagonal half of white blocks
    int intX = 0;
    int intY = 0;
    
    for(int intColumn = 0; intColumn < 300; intColumn += 10){
      for(int intRow = 290 - intColumn ; intRow >= 0; intRow -= 10){
        intX = 600 + 3 + intRow;
        intY = 3 + intColumn;
        
        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);
      }
    }
  }
  
  public void draw_section8(){ // upper right diagonal half of white blocks
    int intX = 0;
    int intY = 0;

    for(int intRow = 0; intRow < 300; intRow += 10){
      for(int intColumn = 0; intColumn <= intRow; intColumn += 10){
        intX = 900 + 3 + intRow;
        intY = 3 + intColumn;

        fill(255);
        noStroke();
        rect(intX, intY, 5, 5);

      }
    }
    
  }

}
