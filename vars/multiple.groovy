def call(int value1, int value2) { 
    def res = new Adder().Multiple(value1, value2)
    println "$res"
    return this
}


