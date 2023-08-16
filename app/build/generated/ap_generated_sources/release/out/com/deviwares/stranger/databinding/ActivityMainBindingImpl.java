package com.deviwares.stranger.databinding;
import com.deviwares.stranger.R;
import com.deviwares.stranger.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.background, 1);
        sViewsWithIds.put(R.id.imageView4, 2);
        sViewsWithIds.put(R.id.userCoinsLayout, 3);
        sViewsWithIds.put(R.id.coins, 4);
        sViewsWithIds.put(R.id.coinImage, 5);
        sViewsWithIds.put(R.id.linearLayout3, 6);
        sViewsWithIds.put(R.id.rewardBtn, 7);
        sViewsWithIds.put(R.id.lottieAnimationView, 8);
        sViewsWithIds.put(R.id.profilePicture, 9);
        sViewsWithIds.put(R.id.textView4, 10);
        sViewsWithIds.put(R.id.textView7, 11);
        sViewsWithIds.put(R.id.findButton, 12);
        sViewsWithIds.put(R.id.linearLayout2, 13);
        sViewsWithIds.put(R.id.textView3, 14);
        sViewsWithIds.put(R.id.coin, 15);
        sViewsWithIds.put(R.id.adView, 16);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (com.google.android.gms.ads.AdView) bindings[16]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.TextView) bindings[4]
            , (android.widget.Button) bindings[12]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.LinearLayout) bindings[13]
            , (android.widget.LinearLayout) bindings[6]
            , (com.airbnb.lottie.LottieAnimationView) bindings[8]
            , (com.mikhaellopez.circularimageview.CircularImageView) bindings[9]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.LinearLayout) bindings[3]
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