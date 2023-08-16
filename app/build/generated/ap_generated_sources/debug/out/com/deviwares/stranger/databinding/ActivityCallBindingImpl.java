package com.deviwares.stranger.databinding;
import com.deviwares.stranger.R;
import com.deviwares.stranger.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityCallBindingImpl extends ActivityCallBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.webView, 1);
        sViewsWithIds.put(R.id.endCall, 2);
        sViewsWithIds.put(R.id.micBtn, 3);
        sViewsWithIds.put(R.id.videoBtn, 4);
        sViewsWithIds.put(R.id.profile, 5);
        sViewsWithIds.put(R.id.name, 6);
        sViewsWithIds.put(R.id.city, 7);
        sViewsWithIds.put(R.id.controls, 8);
        sViewsWithIds.put(R.id.connectingImage, 9);
        sViewsWithIds.put(R.id.loadingAnimation, 10);
        sViewsWithIds.put(R.id.loadingGroup, 11);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityCallBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private ActivityCallBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[7]
            , (android.widget.ImageView) bindings[9]
            , (androidx.constraintlayout.widget.Group) bindings[8]
            , (android.widget.ImageView) bindings[2]
            , (com.airbnb.lottie.LottieAnimationView) bindings[10]
            , (androidx.constraintlayout.widget.Group) bindings[11]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[6]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[5]
            , (android.widget.ImageView) bindings[4]
            , (android.webkit.WebView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}