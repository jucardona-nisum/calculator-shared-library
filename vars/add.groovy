def call(int value1, int value2) {
    
    def res = new Adder().Add(value1, value2)

    println "$res"

    return this
}
