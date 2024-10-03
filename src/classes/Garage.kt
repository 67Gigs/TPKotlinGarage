package classes

data class Garage(var vehicules: ArrayList<Vehicule>) {

    fun ajouterVehicule(vehicule: Vehicule) {
        vehicules += vehicule
    }

    fun afficherGarage() {
        for (vehicule in vehicules) {
            vehicule.afficherDetails()
        }
    }
}