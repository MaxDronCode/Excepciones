package excepcions

class nombreDeCostatsMassaBaixException: Exception {
    constructor(): this("Els nombre de costats no pot ser inferior a 3")
    constructor(missatgte:String) : super(missatgte)
}