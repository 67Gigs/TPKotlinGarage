import classes.Camion
import classes.Garage
import classes.Moto
import classes.Voiture

fun main() {

    val garage = Garage(arrayListOf())

    garage.ajouterVehicule(Voiture("Peugeot", "Gris", 2019, 4, 8))
    garage.ajouterVehicule(Voiture("Renault", "Bleu", 2018, 4, 5))
    garage.ajouterVehicule(Voiture("Porsche 911", "Vert", 2020, 4, 6))

    garage.ajouterVehicule(Moto("Honda", "Rouge", 2017, false))
    garage.ajouterVehicule(Moto("Yamaha", "Noir", 2020, true))

    garage.ajouterVehicule(Camion("Renault", "Blanc", 2018,  123.0))
    garage.ajouterVehicule(Camion("Mercedes", "Jaune", 2019,  110.0))

    garage.afficherGarage()

    garage.klaxonner()

    garage.affichageChoix("Voiture")

    garage.affichageChoix("Moto")

    garage.affichageChoix("Camion")
}