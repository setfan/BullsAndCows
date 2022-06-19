class Complex {

    double real = 0;
    double image = 0;


    void add(Complex num) {

        this.real += num.real;
        this.image += num.image;
    }

    void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }

}