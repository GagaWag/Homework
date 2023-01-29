package classesAndObjects.exceptionAccounting;

import java.util.Date;

/*      Доработать домашнее задание предыдущего урока.
        Теперь надо создать свои классы исключений на каждую ситуацию:
        Проверить содержит ли номер документа последовательность abc.
        Проверить начинается ли номер документа с последовательности 555.
        Проверить заканчивается ли номер документа на последовательность 1a2b.
        Если номер документа не удовлетворяет условию - то "бросить"
        исключение.
        В методе класса, в котором будут вызываться эти методы для
        демонстрации работы, перехватить исключение конструкцией try-catch и
        в блоке catch вывести сообщение для пользователя (сообщение на
        консоль).*/

public class AccountingSystemDemo {
    public static void main(String[] args) throws WrongDocumentFormatException {
        Date date = new Date();
        Document[] documents = {
                new SupplyGoodsContract(date, "555abc1a2b", "type1", 100),
                new ContractWithEmployee(date, "555abc1a2b", date, "Oleg"),
                new FinancialInvoice(date, "555abc", 120, "1")};
        Register document = new Document();
        try {
            document.saveDocument(documents);
        } catch (WrongDocumentFormatException e) {
            System.out.println(e);
        }
        document.getDocumentInformation(documents[0]);
    }
}
