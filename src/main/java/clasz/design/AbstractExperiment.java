package clasz.design;

//interface Ex extends Experiment{}
abstract class Experiment {
    abstract String performance();
    abstract boolean result();

}

abstract class ScienceExperiment extends Experiment{

     String performance(){
        return "performing science experiment";
    }
}

class ScoolLabWork extends ScienceExperiment{

    protected boolean result(){
        return true;
    }
}