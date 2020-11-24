val captainStuff=("Picard","Enterprise-D","NCC-1701-D")
println(captainStuff)

println(captainStuff._1)
println(captainStuff._2)
println(captainStuff._3)

val picardShip="Picard" -> "Enterprise-D"
println(picardShip._2)

val aBunchOfStuff=("Kirk",1964,true)

val shipList=List("Enterprise", "Defiant", "Voyager", "Deep Space Nine")
println(shipList(1))
println(shipList(0))
println(shipList.head)
println(shipList.tail)

for(ship <- shipList) {println(ship)}
val backwardShips=shipList.map( (ship:String) => {ship.reverse} )
for(ship <- backwardShips) {println(ship)}

val numberList=List(1,2,3,4,5)
val sum=numberList.reduce( (x:Int,y:Int) => x+y )
println(sum)

val iHateFives=numberList.filter( (x:Int) => x != 5 )
val iHateThrees=numberList.filter(_ != 3)

val moreNumbers=List(6,7,8)
val lotsOfNumbers=numberList ++ moreNumbers

val reversed=numberList.reverse
val sorted=reversed.sorted
val lotsOfDuplicates=numberList ++ numberList
val distinctValues=lotsOfDuplicates.distinct
val maxValue=numberList.max
val total=numberList.sum
val hasThree=iHateThrees.contains(3)

val shipMap=Map("kirk"->"Enterprise","Picard"->"Enterprise-D","Sisko"->"Deep Space Nine","Janeway"->"Voyager")
println(shipMap("Janeway"))
println(shipMap.contains("Archer"))
val archersShip=util.Try(shipMap("Archer")) getOrElse "Unknown"
println(archersShip)