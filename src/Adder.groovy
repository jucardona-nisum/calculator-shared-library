class Adder {
    def Add(int x, int y) {
        return x+y
    }

    def Substract(int x, int y ){
        return x - y
    }
    def Multiple(int x, int y){
        return x * y
    }

    def Divide(int x, int y){
        try{
            return x / y
        }catch(Exception ex){
            println(ex)
            return ex.getMessage()
        }
    }
}
