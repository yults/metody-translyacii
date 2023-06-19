while (<>) {
    s/(\d*)0($| )/$1$2/g;
    print;
}