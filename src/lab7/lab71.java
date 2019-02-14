package lab7;

public class lab71 {
    /*
    public static void main(String[] args) {
        Train[] train = new Train[20];
        for (int i = 0; i < 20; i++) {
            int k = (int) (Math.random() * 3);
            if (k == 0) {
                train[i] = new Coach();
            } else if (k == 1) {
                train[i] = new LuxCoach();
            } else {
                train[i] = new Luggage();
            }
        }
        LinkedHashSet<Train> trainHashSet = new LinkedHashSet<>(Arrays.asList(train));
        trainHashSet.add(new Train(5,10,"Additional Coach"));
        System.out.print(trainHashSet.remove(train[5]));
        System.out.println(trainHashSet.contains(train[7]));
        System.out.println("\n---------------------------------------------");
        Iterator<Train> trainIterator = trainHashSet.iterator();
        for (int i = 0; i < trainHashSet.size(); i++) {
            if (trainIterator.hasNext() && !trainIterator.next().equals(train[7])){
                trainIterator.remove();
            }
        }
        System.out.println(trainHashSet.toString());

        System.out.println("\n---------------------------------------------");
        trainHashSet.clear();
        trainHashSet.addAll(Arrays.asList(train));
        LinkedHashSet<Train> tempCollection = new LinkedHashSet<>();
        tempCollection.add(train[0]);
        tempCollection.add(train[1]);
        trainHashSet.retainAll(tempCollection);
        System.out.println(trainHashSet.toString());

    }*/
}