open class BaseViewModel : ViewModel(), LifecycleObserver {

    private var compositeDisposable: CompositeDisposable? = null

    open fun Disposable.add() {
        if (compositeDisposable == null || compositeDisposable!!.isDisposed) {
            compositeDisposable = CompositeDisposable()
        }
        compositeDisposable!!.add(this)
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    protected open fun onCreate() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    protected open fun onResume() {
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    protected open fun onDestroy() {
    }

    override fun onCleared() {
        super.onCleared()
        if (compositeDisposable != null) {
            if (!compositeDisposable!!.isDisposed) {
                compositeDisposable!!.dispose()

            }
            compositeDisposable = null
        }
    }
}
