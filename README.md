## Інструкція для запуску коду:  
1. Склонуйте цей репозиторій:
"git clone [https://github.com/karoll1naa/Lab3-Java](https://github.com/karoll1naa/Lab3-Java)"
2. Перейдіть до папки проекту за допомогою командного рядка
3. Переконайтесь, що у вас встановлений Maven:  
"mvn -v"
4. У терміналі, у каталозі проекту, виконайте:  
"mvn clean install"
5. Запустіть програму:  
"mvn run" або через ваше IDE
## Використання програми: 
Ця програма дозволяє працювати з масивами об'єктів класу будівельних блоків по типу блоків з minecraft.
1.  Ви можете створювати нові об'єкти будівельних блоків у класі BuildingBlocks, вам потрібно також вказати властивості даного блоку (такі як  назва блоку, його твердість, рівень світла, мобільність, прозорість та світ у якому блок можна знайти).
2.  Після цього, програма відсортує масиви за твердістю (за зростанням) та за рівнем світла (за спаданням).
3.  Також ви можете знайти конкретний блок у масиві (наприклад, якщо у вас багато масивів). Ви вводите назву блоку, і програма знайде та виведе відповідний блок, якщо він існує в масиві.
