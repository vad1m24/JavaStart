package HomeTask5;

public class mian {
    /**
     * Реализовать телефонный справочник.
     * В справочнике есть фамилии и номера телефонов.
     * В справочнике обычно ищем номер по фамилии.
     * При этом могут быть однофамильцы -> за одной фамилией скрывается несколько номеров
     * <p>
     * Пример
     * "Иванов", "123456"
     * "Васильев", "321456"
     * "Петрова", "234561"
     * "Иванов", "234432"
     * "Петрова", "654321"
     * "Иванов", "345678"
     * <p>
     * Вывести номера по фамилии Иванов.
     */
    public static void main(String[] args) {
        phoneBook phoneBook = new phoneBook();
        phoneBook.add("Иванов", "123456"); // !
        phoneBook.add("Васильев", "321456");
        phoneBook.add("Петрова", "234561");
        phoneBook.add("Иванов", "234432"); // !
        phoneBook.add("Петрова", "654321");
        phoneBook.add("Иванов", "345678"); // !

        System.out.println("Иванов " + phoneBook.getBySurname("Иванов"));
        System.out.println("Васильев " + phoneBook.getBySurname("Васильев"));
        System.out.println("Петрова " + phoneBook.getBySurname("Петрова"));
        System.out.println("Сидоров " + phoneBook.getBySurname("Сидоров"));
    }
}