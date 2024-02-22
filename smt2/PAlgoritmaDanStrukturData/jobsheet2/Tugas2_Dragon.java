public class Tugas2_Dragon {
    int x, y, height , width;

    public Tugas2_Dragon(int i, int j, int k, int l) {
        x = i;
        y = j;
        height = k;
        width = l;
    }

    void moveLeft(){
        if (x > 0 || x < width) {
            x--;  
        }
        
    }

    void moveRight(){
        if (x > 0 || x < width) {
            x++;  
        }
    }

    void moveUp(){
        if (y > 0 || x < height) {
            y--;  
        }
    }

    void moveDown(){
        if (y > 0 || x < height) {
            y++;  
        }
    }

    void printPosition(){
        System.out.println("Posisi Dragon (x, y) (" + x + ", " + y + ")");
        if (x == 0 || y == 0) {
            detectCollision(x, y);
        }
    }

    void detectCollision(int x, int y){
        System.out.println("Game Over ");
    }
}
