package homework26.enumTask;
/*
Создать интерфейс Фильтр. В него добавьте метод, который принимает строку (веб-адрес, к которому подключается человек)
 и тип пользователя (enum). Метод отдает boolean значение, пропускает ли он человека к ресурсу или нет.
 */
public interface Filter {

    boolean checkAccess (String site, Type type);
}
