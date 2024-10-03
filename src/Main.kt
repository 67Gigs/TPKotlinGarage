import classes.Camion
import classes.Garage
import classes.Moto
import classes.Voiture

fun main() {

    val voiture = Voiture("Peugeot", "Gris", 2019, 4)
    val moto = Moto("Yamaha", "Noir", 2020, true)
    val camion = Camion("Renault", "Blanc", 2018,  123.0)

    val garage = Garage(arrayOf())

    garage.ajouterVehicule(voiture)
    garage.ajouterVehicule(moto)
    garage.ajouterVehicule(camion)

    garage.afficherGarage()

    for (vehicule in garage.vehicules) { vehicule.klaxonner() }
}