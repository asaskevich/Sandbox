#include <QLabel>
#include <QApplication>

// OK, we start to learn Qt for C++
int main(int argc, char *argv[])
{
    QApplication app(argc, argv);
    QLabel label("Hello, Qt");
    // It's just for beauty
    app.setApplicationDisplayName("Example1");
    label.setFixedHeight(40);
    label.setFixedWidth(150);
    label.setAlignment(Qt::AlignCenter);
    label.show();
    return app.exec();
}
