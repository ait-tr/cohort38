Git — это система управления версиями, которая позволяет отслеживать изменения в исходном коде и совместно работать над проектами. Вот основные команды и действия, которые могут быть полезны при использовании Git:

1. **Инициализация репозитория:**
   - `git init`: Инициирует новый Git-репозиторий в текущей директории.

2. **Основные команды для добавления и коммита изменений:**
   - `git add <file>`: Добавляет файлы в индекс (staging area) для последующего коммита.
   - `git add .` или `git add -A`: Добавляет все измененные файлы в индекс.
   - `git commit -m "Сообщение коммита"`: Создает коммит с добавленными в индекс файлами и описанием изменений.

3. **Просмотр изменений:**
   - `git status`: Показывает состояние изменений как неотслеженные, измененные или подготовленные к коммиту.
   - `git diff`: Показывает изменения между рабочим каталогом и последним коммитом.

4. **История коммитов:**
   - `git log`: Показывает историю коммитов.
   - `git log --oneline`: Выводит краткую версию истории коммитов.