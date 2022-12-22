package mobi.omegacentauri.lapcount;

interface MyTimeKeeper {
    void updateViews();
    void restore();
    void stopUpdating();
    void destroy();
    void suspend();

    void copyToClipboard();
}
