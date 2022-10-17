public class Main {
    public static void main(String[] args) {
        var firstBoxer = 78.2; // 6 задание
        var seconBoxer = 82.7;
        var allWeight = firstBoxer + seconBoxer;
        System.out.println("Общий вес " +allWeight +" кг");
        var raznitcaWeight1 = seconBoxer - firstBoxer; // 7 задание, 1 способ
        var raznitcaWeight2 = seconBoxer % firstBoxer; // 7 задание, 2 способ
        System.out.println("Разница веса " +raznitcaWeight1 + "кг");
        System.out.println("Разница веса " +raznitcaWeight2 + "кг");

        var time = 640; // 8 задание
        var hrs = 8;
        var members = time / hrs;
        System.out.println("Всего работников в компании – " +members +" человек.");
        var ifMembers = members + 94;
        var fullTime = hrs * ifMembers;
        System.out.println("Если в компании работает " +ifMembers +" человек, то всего " + fullTime +" часов работы может быть поделено между сотрудниками");
    }
}