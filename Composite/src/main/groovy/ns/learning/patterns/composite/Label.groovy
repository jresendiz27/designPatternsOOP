package ns.learning.patterns.composite

class Label implements Widget {

    @Override
    void setPosition(int x, int y) {

    }

    @Override
    void setWidth(int width) {

    }

    @Override
    void setHeight(int height) {

    }

    @Override
    String draw(String tabs) {
        return "${tabs}A Label${System.lineSeparator()}"
    }
}