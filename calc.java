class calc {
    float add(float x, float y) {
        return x + y;
    }

    float sub(float x, float y) {
        return x - y;
    }

    float mul(float x, float y) {
        return x * y;
    }

    float div(float x, float y) {
        return x / y;
    }

    public static void main(String[] args) {
        calc c = new calc();
        float x = 10;
        float y = 20;

        float add = c.add(x, y);
        System.out.println(add);

        float sub = c.sub(x, y);
        System.out.println(sub);

        float mul = c.mul(x, y);
        System.out.println(mul);

        float div = c.div(x, y);
        System.out.println(div);
    }
}