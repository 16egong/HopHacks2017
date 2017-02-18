#define REDPIN 5
#define GREENPIN 6
#define BLUEPIN 3

//#include <Adafruit_CircuitPlayground.h>

String inputString = "";         // a string to hold incoming data
boolean stringComplete = false;  // whether the string is complete

  
//299 queries
int redList[] = {8, 17, 26, 35, 43, 52, 61, 70, 79, 87, 96, 105, 114, 123, 131, 140, 149, 158, 167, 175, 184, 193, 202, 211, 219, 228, 237, 246, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 255, 254, 253, 253, 252, 252, 251, 250, 250, 249, 249, 248, 247, 247, 246, 246, 245, 245, 244, 243, 243, 242, 242, 241, 240, 240, 239, 239, 238, 237, 237, 236, 236, 235, 235, 234, 233, 233, 232, 232, 231, 230, 230, 229, 229, 228, 228, 227, 226, 226, 225, 225, 224, 223, 223, 222, 222, 221, 220, 220, 219, 219, 218, 218, 217, 216, 216, 215, 215, 214, 213, 213, 212, 212, 211, 211, 210, 209, 209, 208, 208, 207, 206, 206, 205, 205, 204, 203, 203, 202, 202, 201, 201, 200, 199, 199, 198, 198, 197, 196, 196, 195, 195, 194, 193, 193, 192, 192, 191, 191, 190, 189, 189, 188, 188, 187, 186, 186, 185, 185, 184, 184, 183, 182, 182, 181, 181, 180, 179, 179, 178, 178, 177, 176, 176, 175, 175, 174, 174, 173, 172, 172, 171, 171, 170, 169, 169, 168, 168, 167, 167, 166, 165, 165, 164, 164, 163, 162, 162, 161, 161, 160, 159, 159, 158, 158, 157, 157, 156, 155, 155, 154, 154, 153, 152, 152, 151, 151, 150, 150, 149, 148, 147, 146, 145, 144, 142, 141, 140, 139, 138, 137, 136, 135, 134, 133, 132, 131, 130, 129, 128
                };
int greenList[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 4, 6, 8, 10, 13, 15, 17, 19, 21, 23, 26, 28, 30, 32, 34, 36, 39, 41, 43, 45, 47, 49, 52, 54, 56, 58, 60, 62, 65, 67, 69, 71, 73, 75, 78, 80, 82, 84, 86, 88, 91, 93, 95, 97, 99, 101, 104, 106, 108, 110, 112, 114, 117, 119, 121, 123, 125, 128, 128, 130, 132, 135, 137, 140, 142, 145, 147, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 149, 148, 147, 146, 145, 144, 142, 141, 140, 139, 138, 137, 136, 135, 134, 133, 132, 131, 130, 129, 128
                  };
int blueList[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 5, 6, 7, 9, 10, 11, 12, 14, 15, 16, 18, 19, 20, 22, 23, 24, 25, 27, 28, 29, 31, 32, 33, 34, 36, 37, 38, 40, 41, 42, 44, 45, 46, 47, 49, 50, 51, 53, 54, 55, 57, 58, 59, 60, 62, 63, 64, 66, 67, 68, 69, 71, 72, 73, 75, 76, 77, 79, 80, 81, 82, 84, 85, 86, 88, 89, 90, 92, 93, 94, 95, 97, 98, 99, 101, 102, 103, 104, 106, 107, 108, 110, 111, 112, 114, 115, 116, 117, 119, 120, 121, 123, 124, 125, 127, 128, 129, 130, 132, 133, 134, 136, 137, 138, 139, 141, 142, 143, 145, 146, 147, 149, 150, 151, 152, 154, 155, 156, 158, 159, 160, 162, 163, 164, 165, 167, 168, 169, 171, 172, 173, 174, 176, 177, 178, 180, 181, 182, 184, 185, 186, 187, 189, 190, 191, 193, 194, 195, 197, 198, 199, 200, 202, 203, 204, 206, 207, 208, 209, 211, 212, 213, 215, 216, 217, 219, 220, 221, 222, 224, 225, 226, 228, 229, 230, 232, 233, 234, 235, 236, 237, 238, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 250, 251, 252, 253, 255
                 };

void setup() {
  // put your setup code here, to run once:
  //Serial.begin(115200);

  // initialize serial:
  Serial.begin(9600);
  // reserve 20 bytes for the inputString:
  inputString.reserve(20);
  
  pinMode(REDPIN, OUTPUT);
  pinMode(GREENPIN, OUTPUT);
  pinMode(BLUEPIN, OUTPUT);
  analogWrite(REDPIN, 0);
  analogWrite(GREENPIN, 0);
  analogWrite(BLUEPIN, 0);
}

int r_prev = 0, g_prev = 0, b_prev = 0; //sets previous r, g, b values
int t_int = 15; //controls the duration of the intervals
int split = 0; //do not change - necessary for the persistence of vision function
int cycles = 299;

//float increment = (float) 255 / (30 * 60);

void loop() {
  // put your main code here, to run repeatedly:
  if (stringComplete) {
    Serial.println(inputString);
    for (int count = 1; count <= cycles; count++) {
      //fade from one color to the next
      for (int a = 0; a < t_int; a++) {
        split = ((t_int - a) / (a + 1));
        analogWrite(REDPIN, r_prev + redList[count - 1]);
        analogWrite(GREENPIN, g_prev + greenList[count - 1]);
        analogWrite(BLUEPIN, b_prev + blueList[count - 1]);
        delay(split);
        for (int z = 0; z <= a; z++) {
          analogWrite(REDPIN, r_prev + redList[count]);
          analogWrite(GREENPIN, g_prev + greenList[count]);
          analogWrite(BLUEPIN, b_prev + blueList[count]);
          delay(1);
          
          analogWrite(REDPIN, r_prev + redList[count - 1]);
          analogWrite(GREENPIN, g_prev + greenList[count - 1]);
          analogWrite(BLUEPIN, b_prev + blueList[count - 1]);
          delay(split);
        }
      }
      if (count = cycles - 1) {
        delay(3000);
      }
   }
  }
}
  /*
  analogWrite(REDPIN, 128);
  analogWrite(GREENPIN, 128);
  analogWrite(BLUEPIN, 255);
  delay(50000);
  */
