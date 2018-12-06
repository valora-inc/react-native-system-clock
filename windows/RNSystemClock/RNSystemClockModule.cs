using ReactNative.Bridge;
using System;
using System.Collections.Generic;
using Windows.ApplicationModel.Core;
using Windows.UI.Core;

namespace System.Clock.RNSystemClock
{
    /// <summary>
    /// A module that allows JS to share data.
    /// </summary>
    class RNSystemClockModule : NativeModuleBase
    {
        /// <summary>
        /// Instantiates the <see cref="RNSystemClockModule"/>.
        /// </summary>
        internal RNSystemClockModule()
        {

        }

        /// <summary>
        /// The name of the native module.
        /// </summary>
        public override string Name
        {
            get
            {
                return "RNSystemClock";
            }
        }
    }
}
