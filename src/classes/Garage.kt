package classes

data class Garage(var vehicules: Array<Vehicule>) {

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules += vehicule
    }

    fun afficherGarage() {
        for (vehicule in vehicules) {
            vehicule.afficherDetails()
        }
    }
}