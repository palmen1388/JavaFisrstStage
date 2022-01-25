public class Book {
        String name;
        int numberOfPages;
        int yearOfRelease;
        String author;

        Book () {

        }

        Book (String name, int numberOfPages, int yearOfRelease, String  author) {
            this.name = name;
            this.numberOfPages = numberOfPages;
            this.yearOfRelease =yearOfRelease;
            this.author = author;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumberOfPages() {
            return numberOfPages;
        }

        public void setNumberOfPages(int numberOfPages) {
            this.numberOfPages = numberOfPages;
        }

        public int getYearOfRelease() {
            return yearOfRelease;
        }

        public void setYearOfRelease(int yearOfRelease) {
            this.yearOfRelease = yearOfRelease;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
}


