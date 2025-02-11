class DVD extends LibraryItem implements Reservable {
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 5;
    }

    @Override
    public void reserveItem() {
        System.out.println("DVD reserved.");
    }

    @Override
    public boolean checkAvailability() {
        return true;
    }
}