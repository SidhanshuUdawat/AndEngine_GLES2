package org.andengine.engine.options;

/**
 * (c) Zynga 2012
 *
 * @author Nicolas Gramlich <ngramlich@zynga.com>
 * @since 16:01:53 - 12.05.2012
 */
public class ConfigChooserOptions {
	// ===========================================================
	// Constants
	// ===========================================================

	private static final int RED_SIZE_DEFAULT = 5;
	private static final int GREEN_SIZE_DEFAULT = 6;
	private static final int BLUE_SIZE_DEFAULT = 5;
	private static final int DEPTH_SIZE_DEFAULT = 0;
	private static final int ALPHA_SIZE_DEFAULT = 0;
	private static final int STENCIL_SIZE_DEFAULT = 0;

	// ===========================================================
	// Fields
	// ===========================================================

	private boolean mRequestedMultiSampling = false;

	private int mRequestedRedSize = ConfigChooserOptions.RED_SIZE_DEFAULT;
	private int mRequestedGreenSize = ConfigChooserOptions.GREEN_SIZE_DEFAULT;
	private int mRequestedBlueSize = ConfigChooserOptions.BLUE_SIZE_DEFAULT;
	private int mRequestedAlphaSize = ConfigChooserOptions.ALPHA_SIZE_DEFAULT;
	private int mRequestedDepthSize = ConfigChooserOptions.DEPTH_SIZE_DEFAULT;
	private int mRequestedStencilSize = ConfigChooserOptions.STENCIL_SIZE_DEFAULT;

	// ===========================================================
	// Constructors
	// ===========================================================

	// ===========================================================
	// Getter & Setter
	// ===========================================================

	public boolean isRequestedMultiSampling() {
		return this.mRequestedMultiSampling;
	}

	public void setRequestedMultiSampling(final boolean pRequestedMultiSampling) {
		this.mRequestedMultiSampling = pRequestedMultiSampling;
	}

	public int getRequestedRedSize() {
		return this.mRequestedRedSize;
	}

	public void setRequestedRedSize(final int pRequestedRedSize) {
		this.mRequestedRedSize = pRequestedRedSize;
	}

	public int getRequestedGreenSize() {
		return this.mRequestedGreenSize;
	}

	public void setRequestedGreenSize(final int pRequestedGreenSize) {
		this.mRequestedGreenSize = pRequestedGreenSize;
	}

	public int getRequestedBlueSize() {
		return this.mRequestedBlueSize;
	}

	public void setRequestedBlueSize(final int pRequestedBlueSize) {
		this.mRequestedBlueSize = pRequestedBlueSize;
	}

	public int getRequestedAlphaSize() {
		return this.mRequestedAlphaSize;
	}

	public void setRequestedAlphaSize(final int pRequestedAlphaSize) {
		this.mRequestedAlphaSize = pRequestedAlphaSize;
	}

	public int getRequestedDepthSize() {
		return this.mRequestedDepthSize;
	}

	public void setRequestedDepthSize(final int pRequestedDepthSize) {
		this.mRequestedDepthSize = pRequestedDepthSize;
	}

	public int getRequestedStencilSize() {
		return this.mRequestedStencilSize;
	}

	public void setRequestedStencilSize(final int pRequestedStencilSize) {
		this.mRequestedStencilSize = pRequestedStencilSize;
	}

	// ===========================================================
	// Methods for/from SuperClass/Interfaces
	// ===========================================================

	// ===========================================================
	// Methods
	// ===========================================================

	// ===========================================================
	// Inner and Anonymous Classes
	// ===========================================================
}
