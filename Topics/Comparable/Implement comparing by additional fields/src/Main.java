class Article implements Comparable<Article> {
    private String title;
    private int size;

    public Article(String title, int size) {
        this.title = title;
        this.size = size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public int compareTo(Article otherArticle) {
        int ret = compare(this.getSize(), otherArticle.getSize());

        if (ret == 0) {
            return this.getTitle().compareTo(otherArticle.getTitle());
        } else {
            return ret;
        }
    }

    public int compare(int x, int y) {
        if (x > y) {
            return 1;
        } else if (x < y) {
            return -1;
        } else {
            return 0;
        }
    }
}